package Dao;

import java.io.*;
import java.util.Base64;

import Factory.Factory;
public class FactoryDaoImpl implements FactoryDao{

    private final String filePath = "./Factory.dat";

    /**
     * read date from local file Factory.dat and then return the factory
     * @return Factory
     */

    @Override
    public Factory getFactory(){
        try {
            System.out.println("========使用数据访问对象DAO模式========");
            FileInputStream in = new FileInputStream(filePath);
            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            in.close();
            String str = new String(buffer, "UTF-8");
            return (Factory) fromString(str);
        } catch (ClassNotFoundException | IOException e) {
            return null;
        }
    }

    /**
     * store the factory to local file
     * @param factory the Factory to be stored
     */
    @Override
    public void updateFactory(Factory factory) {

        try {
            System.out.println("========使用数据访问对象DAO模式========");
            String str=toString(factory);
            FileOutputStream fileOut = new FileOutputStream(filePath);
            fileOut.write(str.getBytes());
            fileOut.close();
            System.out.println("Factory data is saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /** Read the object from Base64 string. */
    private  Object fromString( String s ) throws IOException,
            ClassNotFoundException {
        byte [] data = Base64.getDecoder().decode( s );
        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(  data ) );
        Object o  = ois.readObject();
        ois.close();
        return o;
    }

    /** Write the object to a Base64 string. */
    private String toString( Serializable o ) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream( baos );
        oos.writeObject( o );
        oos.close();
        return Base64.getEncoder().encodeToString(baos.toByteArray());
    }
}
