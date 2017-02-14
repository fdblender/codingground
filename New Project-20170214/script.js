function sayHello()
{
   alert("Hello, Coding Ground!");
}


function ourRandomRange(ourMin, ourMax) {
 
  var no = Math.floor(Math.random() * (ourMax - ourMin + 1)) + ourMin;
  //document.write("Random num:"+no+"\n");
  //alert("Random number: "+no);
  return no;
}


//sayHello();
//ourRandomRange(0,4);
