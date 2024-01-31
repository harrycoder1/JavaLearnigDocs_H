sealed class I permits J ,K{

}

final class J extends I {

}

non-sealed class K extends I{

}

// class D2 extends I{
//error will occured at the time of initialization
// }

// for interface 
sealed interface A245 permits B245 {}

non-sealed interface B245 extends A245 {

}
public class SealedClassJ {
    //non-sealed means that are extends by any classes
    //sealed means that are extends by only permits class
}
