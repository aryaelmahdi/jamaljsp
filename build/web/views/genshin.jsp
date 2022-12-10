<%-- 
    Document   : genshin
    Created on : Jul 4, 2022, 7:50:23 PM
    Author     : Wikon3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Genshin Impact</title>
        <jsp:include page='layouts/headgame.jsp'>
            <jsp:param name="title" value="Genshin" />
        </jsp:include>
    </head>

<body>
    <jsp:include page='layouts/navbargenshin.jsp'></jsp:include>

    <div class="card-image">
        <div class="row">
            <img src="public/assets/images/gi.png" alt="">
        </div>

    </div>
    <div class="row">
        <div class="col-12">
            <h1>Valorant</h1>
            <p>Top up Genesis Crystal Genshin Impact hanya dalam hitungan detik!</p>
            <p>Cukup masukan Username & ID Genshin Anda, pilih jumlah Genesis Crystal yang Anda inginkan, selesaikan pembayaran, dan Genesis Crystal akan secara langsung ditambahkan ke akun Genshin Anda.</p>
            <p>Unduh dan mainkan GENSHIN IMPACT sekarang!</p>
        </div>
    </div>
    <form method="POST" action="genshin">
    <div id="data1" class="row">
        <div class="col-12 background-data">
            <h1>Masukan Data Anda</h1>
            <input type="text" value="" name="nama" class="input-submit" id="nama" placeholder="Input your Username" onkeydown="return /[a-z]/i.test(event.key)" required>
            <input type="number" value="" name="uid" class="input-submit" id="uid" placeholder="Input your ID" required>
        </div>
    </div>

    <div class="col-12" id="data2">
        <div class="row background-data">
            <h2>Pilihan Anda</h2>
            <div class="col-12 ">
                <div class="row">
                    <div class="col-3 border-pilihan" id="vpx">                    
                        <label for="x">
                            <img src="public/assets/images/gc.png">
                            <p>250GC 20k</p>
                        </label>
                        <input type="radio" name="Product" value="250 Genesis Crystal" id="x" onclick="clkvp()" required>
                    </div>
                    <div class="col-3 border-pilihan" id="vps" >
                        <label for="x">
                            <img src="public/assets/images/gc.png">
                            <p>500GC 50k</p>
                        </label> 
                        <input type="radio" name="Product" value="500 Genesis Crystal" id="x" onclick="clkvp1()" required>
                    </div>
                    <div class="col-3 border-pilihan" id="vpy" >
                        <label for="x">
                            <img src="public/assets/images/gc.png">
                            <p>1000GC 150k</p>
                        </label> 
                        <input type="radio" name="Product" value="1000 Genesis Crystal" id="x" onclick="clkvp2()">
                    </div>
                    <div class="col-3 border-pilihan" id="vpz" >
                        <label for="x">
                            <img src="public/assets/images/gc.png">
                            <p>1200GC 200k</p>
                        </label> 
                        <input type="radio" name="Product" value="1200 Genesis Crystal" id="x" onclick="clkvp3()">
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row">
                    <div class="col-3 border-pilihan" id="vpx1" >
                        <label for="x">
                            <img src="public/assets/images/gc.png">
                            <p>1500GC 250k</p>
                            <input type="radio" name="Product" value="1500 Genesis Crystal" id="x" onclick="clkvp4()">
                        </label> 
                    </div>
                    <div class="col-3 border-pilihan" id="vps1" >
                        <label for="x">
                            <img src="public/assets/images/gc.png">
                            <p>2100VP 300K</p>
                        </label> 
                        <input type="radio" name="Product" value="2100 Genesis Crystal" id="x" onclick="clkvp5()">
                    </div>
                    <div class="col-3 border-pilihan" id="vpy1" >
                        <label for="x">
                            <img src="public/assets/images/gc.png">
                            <p>2700VP 350K</p>
                        </label> 
                        <input type="radio" name="Product" value="2700 Genesis Crystal" id="x" onclick="clkvp6()">
                    </div>
                    <div class="col-3 border-pilihan" id="vpz1" >
                        <label for="x">
                            <img src="public/assets/images/gc.png">
                            <p>3500VP 400K</p>
                        </label> 
                        <input type="radio" name="Product" value="3500 Genesis Crystal" id="x" onclick="clkvp7()">
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="col-12" id="data3">
        <div class="row background-data">
            <h2>Pembayaran</h2>
            <div class="col-12">
                <div class="col-6">
                    <div class="row wkwk" id="bcaa" >
                        <label for="b">
                            <img src="public/assets/images/BCA3.png">
                        </label>
                        <input type="radio" name="pay" value="bca" id="b" onclick="bca()" required>
                    </div>
                </div>
                <div class="col-6">
                    <div class="row wkwk" id="gopayy" >
                        <label for="b">
                            <img src="public/assets/images/Gopay1.png">
                        </label>
                        <input type="radio" name="pay" value="gopay" id="b" onclick="gopay()">
                    </div>
                </div>
                <button type="submit" class="input-submit" >submit</button>
            </div>
        </div>
    </div>    
    </form>
    
    <jsp:include page='layouts/footer.jsp'></jsp:include>

    <script src="public/assets/backend/myscripts.js"></script>
    

</body>
</html>
