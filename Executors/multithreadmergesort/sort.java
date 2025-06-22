//package Executors.multithreadmergesort;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//
//public class sort {
//    public class sort implements Callable<List<Integer>> {
//        public List<Integer> arrayTosort;
//        private ExecutorService ex;
//        public sort(List<Integer> arrayTosort) {
//            this.arrayTosort=arrayTosort;
//            this.ex=ex;
//        }
//        public List<Integer> call() throws Exception {
//
//            //Base Case
//            if(arrayTosort.size() <= 1){
//                return arrayTosort;
//            }
//            int mid=arrayTosort.size()/2;
//
//            //creating left array
//            List<Integer> leftArray = arrayTosort.subList(0, mid);
//
//        }
//    }
//}
