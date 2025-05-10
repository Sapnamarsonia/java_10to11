package com.example.service;

import com.example.DTO.BookDTO;
import com.example.entity.Author;
import com.example.entity.Book;
import com.example.repository.AuthorRepository;
import com.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    private final String uploadDir = "uploads/";

    @Autowired
    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    // Create a new book
    public BookDTO createBook(BookDTO bookDTO) {
        Author author = authorRepository.findByName(bookDTO.getAuthorName())
                .orElseThrow(() -> new RuntimeException("Author not found"));

        Book book = new Book();
        book.setTitle(bookDTO.getTitle());
        book.setDescription(bookDTO.getDescription());
        book.setAuthor(author);

        Book savedBook = bookRepository.save(book);
        bookDTO.setId(savedBook.getId());

        return bookDTO;
    }

    // Get all books with pagination
    public List<BookDTO> getAllBooks(PageRequest pageRequest) {
        Page<Book> bookPage = bookRepository.findAll(pageRequest);
        return bookPage.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    // Convert Book entity to DTO
    private BookDTO mapToDTO(Book book) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setDescription(book.getDescription());
        bookDTO.setAuthorName(book.getAuthor().getName());
        return bookDTO;
    }

    // Search books by title or author name
    public List<BookDTO> searchBooks(String keyword) {
        List<Book> books = bookRepository.findByTitleContainingIgnoreCaseOrAuthorNameContainingIgnoreCase(keyword, keyword);
        return books.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    // Upload image for book
    public void uploadBookImage(Long id, MultipartFile file) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        try {
            Files.createDirectories(Paths.get(uploadDir)); // ensure directory exists
            String fileName = id + "_" + file.getOriginalFilename();
            Path filePath = Paths.get(uploadDir, fileName);
            file.transferTo(filePath.toFile());

            book.setImageUrl(fileName);
            bookRepository.save(book);
        } catch (IOException e) {
            throw new RuntimeException("Failed to upload file", e);
        }
    }

    // Download image for book
    public Resource downloadBookImage(Long bookId) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        String fileName = book.getImageUrl();
        Path filePath = Paths.get(uploadDir).resolve(fileName);

        try {
            Resource resource = new UrlResource(filePath.toUri());
            if (resource.exists() && resource.isReadable()) {
                return resource;
            } else {
                throw new RuntimeException("Could not read the file!");
            }
        } catch (Exception e) {
            throw new RuntimeException("Error while loading image", e);
        }
    }
}
