package br.com.cursojava.k01concorrencia;


/*
    Concorrência refere-se à capacidade de executar várias tarefas em paralelo, de forma que pareça que estão ocorrendo simultaneamente.
    Em Java, você pode alcançar a concorrência usando várias técnicas e APIs.

1) Threads: A maneira mais comum de alcançar a concorrência em Java é usando threads.
    As threads compartilham recursos. É importante sincronizar o acesso a esses recursos compartilhados!

2) Sincronização: Em Java, você pode usar palavras-chave como synchronized para proteger seções críticas do código,
garantindo que apenas uma thread tenha acesso a essas seções por vez.

3) APIs de concorrência: Java fornece várias APIs de concorrência para facilitar o desenvolvimento.
    java.util.concurrent
    java.util.concurrent.locks => ReentrantLock / ReadWriteLock
    java.util.concurrent.atomic => AtomicInteger / AtomicLong

 */

public class ConcorrenciaTest01 {

}

