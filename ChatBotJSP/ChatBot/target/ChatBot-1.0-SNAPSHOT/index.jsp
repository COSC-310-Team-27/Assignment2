<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/material-design-icons/3.0.1/iconfont/material-icons.min.css">
    <link rel="shortcut icon" type="image/png" href="Images/jpg">
    <title>BookOwl</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<header>
    <div class="head">
        <p><b>
            <img src="Images/owl.jpg" width="50" height="50">
            <span>B</span>
            <span>O</span>
            <span>O</span>
            <span>K</span>
            <span>O</span>
            <span>W</span>
            <span>L</span>
        </b></p>
    </div>
</header>
<section class="main">
    <div class="user-area">BookOwl</div>
    <div class="user-area">
        <span>Fly into newly recommend books</span>
    </div>

</section>
<section>
    <button class="chat-btn">
        <i class="material-icons"> comment </i>
    </button>

    <div class="chat-popup">
        <div class="badge">1</div>
        <div class="chat-area">
            <div class="income-msg">
                <img src="Images/owl.jpg" class="avatar" alt="">
                <span class="msg"> Hi, I am the bookOwl. How can I help you read more today?</span>
            </div>
        </div>

        <div class="input-area">
            <input type="text">
            <button id="emoji-btn">&#128567;</button>
            <button class="submit"> <i class="material-icons"> send </i></button>
        </div>
    </div>
</section>
<script src="https://cdn.jsdelivr.net/npm/@joeattardi/emoji-button@3.1.1/dist/index.min.js"></script>
<script src="main.js"></script>
</body>
</html>

