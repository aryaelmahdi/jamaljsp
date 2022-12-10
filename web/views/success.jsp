<%-- 
    Document   : success
    Created on : Jul 4, 2022, 10:43:01 PM
    Author     : Wikon3
--%>

<html>
    <head>
        <title>Success</title>
        <jsp:include page='layouts/headgame.jsp'>
            <jsp:param name="title" value="Success" />
        </jsp:include>
    </head>

<body>
    <jsp:include page='layouts/navbarsuccess.jsp'></jsp:include>

    <div class="row">
        <div class="col-12">
            <div class="card-newsletter">
                <div class="row">
                    <div class="col-12 card-header">
                        <h1>Pesanan Anda Sedang Di Proses...</h1>
                    </div>
                    <div class="col-12">
                        <p class="card-subtitle">Terima Kasih Atas Pembelianmu Di Toko Kami, Ditunggu Pembelian Berikutnya :)</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page='layouts/footer.jsp'></jsp:include>
</body>
</html>
