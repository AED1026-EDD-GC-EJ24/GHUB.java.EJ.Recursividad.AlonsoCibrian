package miPrincipal;

public class Performance {
    
            private long ti;
            private long tf;
            private boolean stoped = false;
            
            public void start() {
                ti = System.currentTimeMillis();
                stoped = false;
            }

            public void stop() {
                tf = System.currentTimeMillis();
                stoped = true;
            }

            public String toString(){
                if (!stoped){
                    stop();
                 }
                long diff = tf - ti;
                long min = diff / 60000;
                long sec = (diff % 60000) / 1000;
                return diff + " ms. (" + min + " min. " + sec + " seg.)";
            }

            public long getMilis()
            {
                return tf - ti;
            }

            public long getTi() {
                return ti;
            }

            public void setTi(long ti) {
                this.ti = ti;
            }

            public long getTf() {
                return tf;
            }

            public void setTf(long tf) {
                this.tf = tf;
            }

            public boolean isStoped() {
                return stoped;
            }

            public void setStoped(boolean stoped) {
                this.stoped = stoped;
            }
}
