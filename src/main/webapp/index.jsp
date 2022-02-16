<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body >


<nav class="navbar navbar-Dark bg-Dark">
<div class="container-fluid">
 <div class="container">
    <div class="navbar-text d-flex justify-content-center bg-primary text-white fs-4">
     COK HANELI SAYILARI CARPMA
    </div>
  </div>
  
</div>
 </nav>

<form action="submit">
<div class="container">

<div class="mb-3">
     <input type="text" name="S1" class="form-control" 
     placeholder="1. Sayiyi Giriniz" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
  <div class="mb-3">
    <input type="text" name="S2" class="form-control" 
    id="exampleInputPassword1" placeholder="2. Sayiyi Giriniz">
  </div>
  <div class="d-grid gap-2">
 <button type="submit" class="btn btn-primary">CARP</button>
</div>
  
  
</div>
  
</form>
<div class="container">

<textarea id="w3review" name="area" rows="12" cols="150">
${carpim}
</textarea>
<label class="text-danger fs-4">1. Sayinin Uzunlugu.:${sayi1}</label><br/>
<label class="text-danger fs-4">2. Sayinin Uzunlugu.:${sayi2}</label><br/>
<label class="text-danger fs-4">Sonucun Uzunlugu....:${basamak}</label>

</div>



</body>
</html>