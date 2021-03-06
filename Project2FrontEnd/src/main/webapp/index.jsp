<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!--  Bootstrap, Angular Js ,Angular Route js -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
     
   
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    
  
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css"
	rel="stylesheet" />
	<link href="resources/css/sample.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body ng-app="app">
<header>
            <nav class="navbar navbar-default">
            
           <div class="container-fluid">
		<button type="button" class="navbar-toggle collapsed" 
   data-toggle="collapse" data-target="#collapse-example" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
                <div class="navbar-header">
                    <a class="navbar-brand" href="/"><img src="resources/images/ast.jpg" width="40" height="40"></a>
                </div>
<div class="collapse navbar-collapse" id="collapse-example">
                <ul class="nav navbar-nav ">
                <!-- ng-show="true" if currentUser.username is not undefined -->
                <!--  if currentUser.username is undefined,ng-show="false" -->
                <li><a href="" ng-show="currentUser.username">Welcome {{currentUser.username}}</a></li>
                <li><a href="#/editprofile" ng-show="currentUser.username">Edit User Profile</a></li>
                
                 <li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown" ng-show="currentUser.username"> Job <b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#/addjob" ng-show="currentUser.role=='ADMIN'">Add Job</a></li>
							<li><a href="#/alljobs" >Get All jobs</a></li>
						</ul></li>
						
						<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown" ng-show="currentUser.username"> Blog <b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#/addblog">Add Blog Post</a></li>
							<li><a href="#/getblogs" >Get All blogs</a></li>
						</ul></li>
						
                <li><a href="" ng-show="currentUser.username" ng-click="logout()">logout</a></li>
<li><a href="#/register" ng-hide="currentUser.username">Sign Up</a></li>
<li><a href="#/login" ng-hide="currentUser.username">Sign In</a></li>

</ul>
</div>
</div></nav>
</header>
<div ng-view>

</div>
</body>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.9/angular.js"></script>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.9/angular-route.js"></script>
	<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.9/angular-cookies.js"></script>
<script type="text/javascript" src="js/app.js"></script>
<script type="text/javascript" src="controllers/usercontroller.js"></script>
<script type="text/javascript" src="services/userservice.js"></script>
<script type="text/javascript" src="controllers/jobcontroller.js"></script>
<script type="text/javascript" src="services/jobservice.js"></script>
<script type="text/javascript" src="controllers/blogcontroller.js"></script>
<script type="text/javascript" src="services/blogservice.js"></script>
<script type="text/javascript" src="controllers/blogpostdetailscontroller.js"></script>

</html>