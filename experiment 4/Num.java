package hello1;

public class Num {
    int x,y,z,sum;
    Num(int i, int j, int k) {
        x = i;
        y = j;
        z = k;
        sum = x + y + z;
    }
    boolean isSameNum(Num a) {
        if (a.x==x && a.y==y && a.z==z)
            return true;
        else
            return false;
    }
    boolean isSameSum(Num b) {
        if (b.sum==sum)
            return true;
        else
            return false;
    }
}    

