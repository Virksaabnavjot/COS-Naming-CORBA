package Test;

/**
* Test/HelloHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HelloWorldName.idl
* 10 March 2017 05:51:10 o'clock GMT
*/

public final class HelloHolder implements org.omg.CORBA.portable.Streamable
{
  public Test.Hello value = null;

  public HelloHolder ()
  {
  }

  public HelloHolder (Test.Hello initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Test.HelloHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Test.HelloHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Test.HelloHelper.type ();
  }

}
