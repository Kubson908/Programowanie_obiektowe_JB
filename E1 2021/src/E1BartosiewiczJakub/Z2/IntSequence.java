package E1BartosiewiczJakub.Z2;

import java.util.ArrayList;
import java.util.Iterator;

public interface IntSequence {
    boolean hasNext();
    int next();

   static IntSequence of (int...args) {
        return new IntSequence() {
            private int i;

            @Override
            public boolean hasNext() {
                return i < args.length;
            }

            @Override
            public int next() {
                int n;
                if (i < args.length ) {
                    n = args[i];
                    ++i;
                }
                else n = 1;
                return n;
            }
        };

    }

   static IntSequence squares(int a) {
       return new IntSequence() {
           private int i = a;

           @Override
           public boolean hasNext() {
               return true;
           }

           @Override
           public int next() {
               int n = i;
               ++i;
               return n*n;
           }
       };
   }
}
