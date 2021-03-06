import java.util.ArrayList;

/**
 * Created by Kyle on 11/20/2014.
 */
class SafeArrayList<E> extends ArrayList<E> {


    @Override
    public synchronized boolean add(E object){
        return super.add(object);
    }

    @Override
    public synchronized E get(int index){

       try {
           return super.get(index);
       } catch (Exception e){
           e.printStackTrace();
       }
       return null;
    }

    @Override
    public synchronized E remove(int index){
        return super.remove(index);
    }

    @Override
    public synchronized int size(){
        return super.size();
    }
}
