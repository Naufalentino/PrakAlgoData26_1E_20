public class Faktorial20 {

    int FaktorialBF20 (int n){
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    int FaktorialDC20 (int n) {
        if (n==1){
            return 1;
        } else {
            int fakto = n * FaktorialDC20(n-1);
            return fakto;
        }
    }
}