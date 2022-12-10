<%-- 
    Document   : pubgm
    Created on : Jul 4, 2022, 7:50:06 PM
    Author     : Wikon3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pubg Mobile</title>
        <jsp:include page='layouts/headgame.jsp'>
            <jsp:param name="title" value="Pubgm" />
        </jsp:include>
    </head>

<body>
    <jsp:include page='layouts/navbarpubgm.jsp'></jsp:include>

    <div class="card-image">
        <div class="row">
            <img src="public/assets/images/pubg1.jpeg" alt="">
        </div>

    </div>
    <div class="row">
        <div class="col-12">
            <h1>Pubg Mobile</h1>
            <p>Top up UC Pubg Mobile hanya dalam hitungan detik!</p>
            <p>Cukup masukan Username & ID PUBGM Anda, pilih jumlah UC yang Anda inginkan, selesaikan pembayaran, dan UC akan secara langsung ditambahkan ke akun PUBGM Anda.</p>
            <p>Unduh dan mainkan PUBG MOBILE sekarang!</p>
        </div>
    </div>
    <form method="POST" action="pubgm">
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
                            <img src="public/assets/images/uc1.png">
                            <p>500UC 100k</p>
                        </label>
                        <input type="radio" name="Product" value="500 UC" id="x" onclick="clkvp()" required>
                    </div>
                    <div class="col-3 border-pilihan" id="vps" >
                        <label for="x">
                            <img src="public/assets/images/uc1.png">
                            <p>750UC 200k</p>
                        </label> 
                        <input type="radio" name="Product" value="750 UC" id="x" onclick="clkvp1()" required>
                    </div>
                    <div class="col-3 border-pilihan" id="vpy" >
                        <label for="x">
                            <img src="public/assets/images/uc1.png">
                            <p>1000UC 270k</p>
                        </label> 
                        <input type="radio" name="Product" value="1000 UC" id="x" onclick="clkvp2()">
                    </div>
                    <div class="col-3 border-pilihan" id="vpz" >
                        <label for="x">
                            <img src="public/assets/images/uc1.png">
                            <p>1200UC 300k</p>
                        </label> 
                        <input type="radio" name="Product" value="1200 UC" id="x" onclick="clkvp3()">
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row">
                    <div class="col-3 border-pilihan" id="vpx1" >
                        <label for="x">
                            <img src="public/assets/images/uc1.png">
                            <p>1500UC 370K</p>
                        </label> 
                        <input type="radio" name="Product" value="1500 UC" id="x" onclick="clkvp4()">
                    </div>
                    <div class="col-3 border-pilihan" id="vps1" >
                        <label for="x">
                            <img src="public/assets/images/uc1.png">
                            <p>2100UC 400K</p>
                        </label> 
                        <input type="radio" name="Product" value="2100 UC" id="x" onclick="clkvp5()">
                    </div>
                    <div class="col-3 border-pilihan" id="vpy1" >
                        <label for="x">
                            <img src="public/assets/images/uc1.png">
                            <p>2700UC 450K</p>
                        </label> 
                        <input type="radio" name="Product" value="2700 UC" id="x" onclick="clkvp6()">
                    </div>
                    <div class="col-3 border-pilihan" id="vpz1" >
                        <label for="x">
                            <img src="public/assets/images/uc1.png">
                            <p>3500UC 500K</p>
                        </label> 
                        <input type="radio" name="Product" value="3500 UC" id="x" onclick="clkvp7()">
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
