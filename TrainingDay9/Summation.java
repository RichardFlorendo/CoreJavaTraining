public class Summation {
    int sum;

    Summation(int num){
        sum = 0;
        for(int i = 0; i <= num; i++) sum += i;
    }

    Summation(Summation ob){
        sum = ob.sum;
    }
}
