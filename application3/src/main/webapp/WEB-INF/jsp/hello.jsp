

<html>  
<head>  
    <title>Spring MVC Example</title>  
    <script src="webjars/jquery/3.2.1/jquery.min.js"></script>
    
    <script>
	  $(document).ready(function(){
		    
			
			$(".gaj").hover(function(){
		   var text_inp=$(this);
			//  alert($('#gaj').value);
			  text_inp.css("font-size", "18px");
		},
		function(){
		      var text_inp=$(this);
			//  alert($('#gaj').value);
			  text_inp.css("font-size", "15px");
		});
		});
      </script>
</head>  
<body>  
<h1>Welcome to Spring MVC</h1>  
    <p class="gaj">Message is: ${message}</p>  
    
    
</body>  
</html> 