public class WaterSongFixed{
public static void main(String [] args) {
int waterNum=9;
String word="bottles";
while (waterNum>=0)//Note::logical error if waterNum>0 becoz if waterNum=0 && use of use become waste
{
if(waterNum==1)
{
word="bottle";
}
System.out.println(waterNum + " " + word + " of water on the wall");
System.out.println(waterNum + " " + word + " of water");



if(waterNum> 0)
{
 System.out.println(waterNum + " " + word +" of water on the wall");
 System.out.println("Take one down.");
System.out.println("Pass it around.");
}
else
{
 System.out.println("no more bottles of water on the wall");
}
waterNum =waterNum - 1;//decrement value after one trip
}
}
}

