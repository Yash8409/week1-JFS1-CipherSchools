
    interface olaCustomer {
        void bookcab();
        void ride();
        void vrooom();
        void cancelcab();
        void signin();
        void signup();
    }
    interface olaDriver {
        void acceptbooking();
        void rejectbooking();
        void setstatus();
        void getmycommission();
        void callcustomer();
    }
    interface olaOwner {
        void getrevenue();
        void addDriver();
        void changedriver();
    }
    public class abstraction implements olaOwner,olaDriver,olaCustomer {
        public static void main(String[] args) {
            
            olaOwner oO = new abstraction(); // creating object of interface
            oO.getrevenue();
        }

        @Override
        public void bookcab() {
          
            
        }

        @Override
        public void ride() {
        }

        @Override
        public void vrooom() {
            }

        @Override
        public void cancelcab() {
             }

        @Override
        public void signin() {
            }

        @Override
        public void signup() {
             }

        @Override
        public void acceptbooking() {
          }

        @Override
        public void rejectbooking() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void setstatus() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void getmycommission() {
             }

        @Override
        public void callcustomer() {
            }

        @Override
        public void getrevenue() {
           }

        @Override
        public void addDriver() {
             }

        @Override
        public void changedriver() {
              }
    }
