<%-- 
    Document   : home
    Created on : Jul 4, 2022, 5:24:26 PM
    Author     : Wikon3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page='layouts/head.jsp'>
            <jsp:param name="title" value="Homepage" />
        </jsp:include>
    </head>
<body>
        <jsp:include page='layouts/navbar.jsp'></jsp:include>
 
    <div class="row">
        <div class="slides">
            <img class="mySlides" src="public/assets/images/Valorant1.jpg">
            <img class="mySlides" src="public/assets/images/Pubgm1.jpg ">
            <img class="mySlides" src="public/assets/images/ml2.jpeg ">
            <img class="mySlides" src="public/assets/images/gi2.jpeg ">
            <button class="slides-1" onclick="plusDivs(-1) ">&#10094;</button>
            <button id="uwuw" class="slides-2" onclick="plusDivs(1) ">&#10095;</button>
        </div>
    </div>
    <h1 class="title-p">GAMES</h1>
    <div class="col-12 game">
        <div class="row">
            <div class="col-6 sd">
                <a href="valorant">
                    <img src="public/assets/images/valorant.jpg" alt=" ">
                    <div class="judul-produk">Valorant</div>
                </a>
            </div>
            <div class="col-6 sd">
                <a href="pubgm">
                    <img src="public/assets/images/pubgm.jpg" alt=" ">
                    <div class="judul-produk">PUBG Mobile</div>
                </a>
            </div>
        </div>
    </div>
    <div class="col-12 game">
        <div class="row ">
            <div class="col-6 sd">
                <a href="mlbb">
                    <img src="public/assets/images/mlbb.jpg " alt=" ">
                    <div class="judul-produk ">Mobile Legend</div>
                </a>
            </div>
            <div class="col-6 sd">
                <a href="genshin">
                    <img src="public/assets/images/GenshinImpact.jpg " alt=" ">
                    <div id="about" class="judul-produk ">Genshin Impact</div>
                </a>
            </div>
        </div>
    </div>
    <div class="col-12 about">
        <div class="row card">
            <h1>About</h1>
            <br>
            <p>
                <a href=" " class="title "><span>JAMAL GAMING</span></a> adalah website yang menyediakan layanan Top Up
                <br> Kami berdiri sejak tahun 2022 dan belum dipercaya oleh berbagai konsumen.
            </p>
        </div>
        
    </div>

    <jsp:include page='layouts/footer.jsp'></jsp:include>
    <script src="public/assets/backend/myscripts.js"></script>
</body>

</html>