##Note For JS
js中没有块级作用域，而是函数作用域,定义一个函数就定义了一个执行环境。
<pre>
var name="global";
if(true){
    var name="local";
    console.log(name); //local
}
console.log(name);  //local
</pre>

函数作用域：变量在声明他们函数体以及这个函数的嵌套的任意函数体内都是有定义的。

<pre>
var name="global";
function t1(){
    console.log(name);  //undefined
    var name="local"
    console.log(name);  //local
}
t1();
</pre>

函数中出现了变量声明就不会，此变量名就不会再向上级作用域链查找了，词法分析声明都会提到作用域顶部，而赋值还是在原来位置

<pre>
function t1(){
    var name="global";
    function t2(){
        console.log(name);  //undefined
        var name="local";   //去掉该行会沿作用域链查找
        console.log(name);  //local
    }
    t2();
}
t1();

the same as t2
function t2(){
    var name;
    console.log(name);
    name="local";
    console.log(name);
}
</pre>
js中函数作用域的嵌套关系是在定义时决定的，而不是调用时决定的。即语法分析时就可以确定，不必等到运行时。所以最终是在定义他的作用域中运行而不是调用的作用域中运行。
<pre>
var name="global";
function t1(){console.log(name);  }
function t2(){
    var name="local";
    t1();  //global
    console.log(name);  //local
}
t2()
</pre>
with语句主要用来临时扩展作用域链，将语句中的对象添加到作用域的头部。

<pre>
person={name:"man",age:22,height:175,wife:{name:"feman",age:21}};
with(person.wife){
    console.log(name);
}
</pre>
with语句将person.wife添加到当前作用域链的头部，所以输出的就是："feman"
with语句结束后，作用域链恢复正常。

