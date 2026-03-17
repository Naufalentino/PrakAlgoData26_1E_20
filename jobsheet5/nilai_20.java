public class nilai_20 {
    double nilai_uts[];
    double nilai_uas[];
    
    nilai_20(int n){
        nilai_uts = new double[n];
        nilai_uas = new double[n];
    }

    double tertinggiDC20 (double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        }
        
        int mid = (l+r)/2;
        double lmax = tertinggiDC20(arr, l, mid);
        double rmax = tertinggiDC20(arr, mid+1, r);
        if (lmax>rmax){
            return lmax;
        } else {
            return rmax;
        }


    }

    double terendahDC20 (double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        }
        
        int mid = (l+r)/2;
        double lmax = terendahDC20(arr, l, mid);
        double rmax = terendahDC20(arr, mid+1, r);
        if (lmax<rmax){
            return lmax;
        } else {
            return rmax;
        }
    }

    double rataNilaiBF20(double arr[]){
        double total=0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i];
        }
        return total/=arr.length;
    }
}
