package Parse;

import ReadFile.ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import static Parse.Semantics.getMap_concepte;

public class Main {
    public static void main(String[]args) throws IOException {
        float first = System.nanoTime();
        Indexer indexInstance=Indexer.getInstance();
        indexInstance.createPosting("C:/Users/ASUS/Desktop/rotem");
        ReadFile rf= new ReadFile("C:/Users/ASUS/Desktop/minicorpus",false);
        indexInstance.initDictionaries();
        indexInstance.loadFrequenctDic("C:/Users/ASUS/Desktop/rotem",false);
        String query="Falkland petroleum exploration";
        HashMap<String, ArrayList<String>> con=getMap_concepte();
//        Semantics s=new Semantics(query);
//        s.startConnection();
//        for (String sc:con.keySet()) {
//            System.out.println(sc);
//            ArrayList<String> array=con.get(sc);
//            for(int i=0;i<array.size();i++){
//                System.out.println("   "+array.get(i));
//            }
//        }
        //String query="rotem";
//        File f=new File("C:/Users/ASUS/Desktop/Queries.txt");
//        ReadQuery rq= new ReadQuery(f,"C:/Users/ASUS/Desktop/rotem",false,false);
//        //rq.readQuery();
//        Searcher search=new Searcher(query,1,false,"C:/Users/ASUS/Desktop/rotem",false,false);
//        search.Search(rf.getStopWords());
//        float last = System.nanoTime();
//        System.out.println((last - first) * Math.pow(10, -9) / 60);
        System.out.println("********************************done********************************************");
    }
}
