
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    
</head>
<body>
    <h1 align="center">Login </h1>
<div class="album py-5 bg-light">
    <div class="container">
      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
       
 <form  method="post" enctype="application/x-www-form-urlencoded" action="/login">
  
  <div class="mb-3">
    <label for="email" class="form-label">email</label>
    <input type="text" class="form-control"  name="email" value="">
  </div>
  <div><h5>${error}</h5></div>
   <div class="mb-3">
    <label for="password" class="form-label">Password</label>
    <input type="text" class="form-control"  name="password" value="">
  </div>
  <div>
  <input type="submit" value="login" name="action" />
 <input type="button" value="Registrer" name="reset" />
  </div>
   </form>