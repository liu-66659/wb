package mytest;

import org.junit.Test;
import yuki.DupCheckMain;

public class test {
    DupCheckMain d = new DupCheckMain();
    @Test
    
    //
    public void test(){


       // d.getRepetiveRate("D:/ee/wb/src/main/file/a.txt","D:/ee/wb/src/main/file/a1.txt");

        d.getRepetiveRate("D:/ee/wb/src/main/file/b.txt","D:/ee/wb/src/main/file/b1.txt");
    }
}
