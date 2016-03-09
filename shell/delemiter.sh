data="name,sex,age,num,location"
oldIFS=$IFS
IFS=,
for item in $data
do
    echo Item:$item
done
IFS=$oldIFS
