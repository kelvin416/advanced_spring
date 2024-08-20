/* CodingNomads (C)2024 */
package com.codingnomads.corespring.examples.scopeannotaion;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ScopeAnnotationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ScopeAnnotationDemoConfig.class);
        ctx.refresh();
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);

        System.out.println("-----Hashcode of SingletonBean-----");
        System.out.println(singletonBean1.hashCode());
        System.out.println(singletonBean2.hashCode());

        final PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        final PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);

        System.out.println("-----Hashcode of PrototypeBean-----");
        System.out.println(prototypeBean1.hashCode());
        System.out.println(prototypeBean2.hashCode());
        System.out.println();

        final Java101 java1011 = ctx.getBean(Java101.class);
        final Java101 java1012 = ctx.getBean(Java101.class);

        System.out.println("----Java 101 Hashcode SingletonBean");
        System.out.println(java1011.hashCode());
        System.out.println(java1012.hashCode());
        System.out.println();

        final Java102 java1021 = ctx.getBean(Java102.class);
        final Java102 java1022 = ctx.getBean(Java102.class);

        System.out.println("----Java 102 Hashcode SingletonBean---");
        System.out.println(java1021.hashCode());
        System.out.println(java1022.hashCode());
        System.out.println();
        ctx.close();
    }
}
