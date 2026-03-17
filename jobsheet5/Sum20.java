public class Sum20 {
    double keuntungan[];
    
    Sum20(int el){
        keuntungan = new double[el];
    }

    double TotalBF20(){
        double total=0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total+keuntungan[i];
        }
        return total;
    }

    double TotalDC20(double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        }
        
        int mid = (l+r)/2;
        double lsum = TotalDC20(arr, l, mid);
        double rsum = TotalDC20(arr, mid+1, r);
        return lsum+rsum;
    }
}