<%@page import="com.model.PaymentModel"%>
<%@page import="com.dao.Dao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Secure Payment</title>
    <script src="https://checkout.razorpay.com/v1/checkout.js"></script>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', sans-serif;
            background-color: #f4f6f8;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .payment-card {
            background-color: #ffffff;
            padding: 40px 30px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        .payment-card h1 {
            font-size: 22px;
            margin-bottom: 10px;
            color: #333333;
        }

        .payment-card h2 {
            font-size: 20px;
            margin-bottom: 20px;
            color: #555555;
        }

        .payment-card button {
            background-color: #007BFF;
            color: white;
            border: none;
            padding: 12px 20px;
            font-size: 16px;
            border-radius: 6px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .payment-card button:hover {
            background-color: #0056b3;
        }

        @media (max-width: 500px) {
            .payment-card {
                padding: 30px 20px;
            }

            .payment-card h1, .payment-card h2 {
                font-size: 18px;
            }

            .payment-card button {
                width: 100%;
                padding: 12px;
            }
        }
    </style>
</head>
<body>

<%
    String id = request.getParameter("id");
    int id2 = Integer.parseInt(id);
    List<PaymentModel> list = Dao.getpaymentbyid(id2);
    for (PaymentModel pm : list) {
        session.setAttribute("p_name", pm.getP_name());
        session.setAttribute("p_id", pm.getId());
%>

<div class="payment-card">
    <form id="paymentForm">
        <h1><%= pm.getP_name() %></h1>
        <h2>₹<%= pm.getP_price() %></h2>
        <input type="hidden" name="amount" id="amount" value=" 100"> <!-- Convert to paise -->
        <input type="hidden" name="currency" id="currency" value="INR">
        <button type="button" id="rzp-button1">Pay Now</button>
    </form>
</div>

<%
    }
%>

<script>
    var options = {
        "key": "rzp_test_hWS7k6CBHBiHw3", // Replace with your Razorpay test/live key
        "amount": document.getElementById("amount").value,
        "currency": document.getElementById("currency").value,
        "name": "Secure Checkout",
        "description": "Payment for your order",
        "handler": function (response) {
            alert("Payment successful! ID: " + response.razorpay_payment_id);
            window.location.href = 'paymentdetails.jsp';
        },
        "theme": {
            "color": "#007BFF"
        }
    };

    document.getElementById('rzp-button1').onclick = function (e) {
        var rzp1 = new Razorpay(options);
        rzp1.open();
        e.preventDefault();
    }
</script>

</body>
</html>
