<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<form action="submit">
<div class="container">
<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Sayi1</label>
    <input type="number" name="S1" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Sayi2</label>
    <input type="number" name="S2" class="form-control" id="exampleInputPassword1">
  </div>
  <button type="submit" class="btn btn-primary">sonuc</button>
  <button type="button" onclick={"/"}>Temizle</button>
</div>
  
</form>
<div class="container">
<label for="area">Sonuc:</label>
<textarea id="w3review" name="area" rows="18" cols="150">
${carpim}
</textarea>
</div>



</body>
</html>