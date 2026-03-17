public class Pangkat20 {
    int nilai, pangkat;

    Pangkat20(int n, int p){
        nilai = n;
        pangkat = p;
    }

    int pangkatBF20(int a, int n){
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    int pangkatDC20(int a, int n){
        if (n==1) {
            return a;
        } else{
            if (n%2==1) {
                return (pangkatDC20(a, n/2)*pangkatDC20(a, n/2)*a);
            } else {
                return (pangkatDC20(a, n/2)*pangkatDC20(a, n/2));
            }
        }

    }
}
