var http=require("http");
var url=require("url");

//服务器
function start(route,handle){
    http.createServer(function(request,response){
        var pathname=url.parse(request.url).pathname;
        console.log("Request for "+pathname+" Received.")
		
		//request.addListener("data",function(postDataChunk){
		//	postData+=postDataChunk;
		//	console.log("Received POST data chunk '"+postDataChunk+"'");
		//});
		//request.addListener("end",function(){
		route(handle,pathname,response,request);			
		//});


        //response.writeHead(200,{"Content-type":"text-plain"});
//        response.write("Hello World");
  //      response.end();
    }).listen(8888);
    console.log("server started");
}

exports.start=start;
