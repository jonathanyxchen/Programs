public class NumberPrinter {
public static void main (String args[]){
int n=1; 
while(n<100) {
if (n%3==0 || n%5==0) {
System.out.printf("%d ",n);
}
n++;
}
}
}