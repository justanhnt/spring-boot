
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Hello</title>
  <style>
body {
  margin: 0;
  padding: 0;
  font-family: 'Roboto', sans-serif;
}

.form {
  text-align: center;
}

#form-search {
  width: 450px;
  line-height: 32px;
}

.form #form-search {
  padding: 0 8px;
}

.buttons {
  text-align: center;
  padding-top: 30px;
  margin-bottom: 300px;
}

.outer {
  display: table;
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
}

.middle {
  display: table-cell;
  vertical-align: middle;
}

.inner {
  margin-left: auto;
  margin-right: auto;
  width: 400px;
}

#google_search {
  margin: 5px;
}
  </style>
</head>
<body>
<!-- FORM SEARCH -->
<div class="outer">
  <div class="middle">
    <div class="inner">
      <form action="/search" method="post" enctype="application/x-www-form-urlencoded">
        <label for="form-search"></label>
        <input type="text" id="form-search" placeholder="Search Google or type URL" name="term">
        <input type="submit" value="Google Search" id="google_search">
      </form>
    </div>
  </div>
</div>
</body>
</html>