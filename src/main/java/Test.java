import java.io.File;
import org.apache.commons.collections.map.HashedMap;;

public class Test{


/*public void show(Object str){
	System.out.println("String::");
}*/

public void show(double obj){
	System.out.println("Long::");
} 

public void show(float obj){
	System.out.println("Integer::");
}

public static void main(String argv[]) {
	HashedMap hashMap = new HashedMap();
	hashMap.put("Key", "value");
	/*final int abc = 3;
	Test t = new Test();
	//Object  obj = new String("Hello");
	t.show(1.1);*/
	
	System.out.println(System.getProperty("user.dir"));
	File file = new File("\\");
	
	long totalSpace = file.getTotalSpace(); //total disk space in bytes.
	long usableSpace = file.getUsableSpace(); ///unallocated / free disk space in bytes.
	long freeSpace = file.getFreeSpace(); //unallocated / free disk space in bytes.
	
	System.out.println(" === bytes ===");
	System.out.println("Total size : " + totalSpace /1024 /1024 /1024 + " GB");
	System.out.println("Space free : " + usableSpace /1024 /1024 /1024+ " GB");
	System.out.println("Space free : " + freeSpace /1024 /1024  /1024+ " GB");
	
	 /* Total amount of free memory available to the JVM */
	long freeMemory = Runtime.getRuntime().freeMemory()/1024/1024;
    System.out.println("Free memory (bytes): " + freeMemory);

    /* This will return Long.MAX_VALUE if there is no preset limit */
    long maxMemory = Runtime.getRuntime().maxMemory() /1024/1024;
    /* Maximum amount of memory the JVM will attempt to use */
    System.out.println("Maximum memory (bytes): " + 
        (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

    /* Total memory currently available to the JVM */
    long totalMemory = Runtime.getRuntime().totalMemory() /1024/1024;
    System.out.println("Total memory available to JVM (bytes): " + totalMemory);
	
	System.out.println(System.getProperty("os.name"));
}
}