package com.example.controller;


import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.*;

@RestController
@RequestMapping("/images") // Base URL will be /images/...
public class ImageController {

    private static final String IMAGE_DIR = "uploads/";

    // 🔽 IMAGE DOWNLOAD
    @GetMapping("/download/{filename}")
    public ResponseEntity<byte[]> downloadImage(@PathVariable String filename) throws IOException {
        Path path = Paths.get(IMAGE_DIR + filename);
        byte[] imageBytes = Files.readAllBytes(path);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG); // Or detect based on file extension
        headers.setContentDisposition(ContentDisposition.inline().filename(filename).build());

        return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
    }

    // 🔼 IMAGE UPLOAD (optional, but handy to test the full flow)
    @PostMapping("/upload")
    public String uploadImage(@RequestParam("file") MultipartFile file) throws IOException {
        Files.createDirectories(Paths.get(IMAGE_DIR));
        Path path = Paths.get(IMAGE_DIR + file.getOriginalFilename());
        Files.write(path, file.getBytes());
        return "Uploaded: " + file.getOriginalFilename();
    }
}

