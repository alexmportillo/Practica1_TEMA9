package models;
import java.util.*;
public class Lista<T> {
	private int MAX;
	private int PRINCIPIO;
    private int FINAL;
    private T[]Elementos;
    private int index;
	//Constructo vacio
	public Lista(){
		this.FINAL=50;
		this.PRINCIPIO=0;
		this.FINAL=0;
		this.Elementos=Elementos;
		this.index=0;
		}
	
	public boolean ColaLlena(T[] element)
    {
        if(this.FINAL == this.MAX)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
	public void add(T element){
	T  ITEM = null;
	{
		if(this.ColaLlena(Elementos))
        {
            System.out.println("LA COLA ESTÁ LLENA");
        }
        else
        {
            
            this.FINAL++; 
            this.Elementos[FINAL] =ITEM ;
                        
        }
	}
}
	
	public void remove (T element)
	{
		if(this.PRINCIPIO == this.FINAL)
        {
			
            System.out.println("LA COLA ESTA VACIA");
        }
        else
        {            
            for(int i=PRINCIPIO;i < FINAL - 1;i++)
            {
            	Elementos[i] =Elementos[i+1];
            }
             
            FINAL--;
        }
    }
	
	public T getNext()
	{
		return null;
	}
	public T getPrev(){
		return null;
	}
	public T getCurrent(){
		return null;
	}
	
	public int setIndex(int i){
		T[] x = Elementos;
        if (x.equals(Elementos)) return -1;
		 return i;
	}
}
