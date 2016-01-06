<?php
    echo $_GET['nihao'],'<br/>';
    echo $_REQUEST['meiyoi'].'<br/>';
    $ls=`ls -al`;
    echo "<pre> $ls </pre>".'<br/>';
    echo gettype($ls);
    /*$fp=fopen("https://www.baidu.com/","r");
    echo "<pre> $fp </pre>";
    while(!feof($fp)){
        echo fgets($fp,999);
    }
    fclose($fp);*/
    echo '<br/>';
    echo `date`.'<br/>';
    var_dump(range(1,10));
    echo '<br/>'.ucwords("nihao,wozhiao haoba");
    echo '<br/>'.strstr("nihao,woshi shui ya nimeiyou","i");
    echo '<br/>'.strrchr("nihao,woshi shui ya nimeiyou","i");
    echo '<br/>';

    class Car{
        private $brand;
        private $price;


        public function __set($name,$value){
            $this->$name=$value;
        }

        public function __get($name){
            return   $this->$name;
        }
    }

    $car=new Car();
    $car->brand="ben";
    echo $car->brand;
    echo '<br/>'.addslashes("nihao?wouq/[];.");
    echo '<br/><br/><br/>';


    $ch=curl_init("http://support.lenovo.com.cn/lenovo/wsi/station/servicestation/Api/QueryMap.ashx?area=%E5%A4%A9%E6%B4%A5%E5%B8%82&type=%E7%AC%94%E8%AE%B0%E6%9C%AC&stationId=");
    $output = curl_exec($ch);
    curl_close($ch);
    print_r($output);





