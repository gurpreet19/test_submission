package com.mobiquity.packer;
import com.mobiquity.exception.APIException;

public class TesterClass {

    public static void main(String[] args) throws APIException {
        /*if (args.length != 1){
            System.err.println("Only file path must be provided as argument, extra argument are not allowed");
            System.exit(1);
        }*/
        args[0]="/Users/gurpreet/Downloads/skeleton_java 2/src/main/test/resources/example_input";
        System.out.println(Packer.pack(args[0]));
    }

}
