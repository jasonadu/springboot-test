# format refer to site [websequencediagrams|https://www.websequencediagrams.com/]

title Spring Boot booting process(1/2)
DemoApplication->DemoApplication: main
DemoApplication->SpringApplication: run
SpringApplication->SpringApplication: refreshContext
SpringApplication->SpringApplication: refresh
SpringApplication->EmbeddedWebApplicationContext: refresh
EmbeddedWebApplicationContext->AbstractApplicationContext: refresh
AbstractApplicationContext->EmbeddedWebApplicationContext: finishRefresh
EmbeddedWebApplicationContext->EmbeddedWebApplicationContext: startEmbeddedServletContainer
EmbeddedWebApplicationContext->TomcatEmbeddedServletContainer: start
TomcatEmbeddedServletContainer->TomcatEmbeddedServletContainer: addPreviouslyRemovedConnectors
TomcatEmbeddedServletContainer->StandardService: addConnector
StandardService->LifecycleBase: start
LifecycleBase->Connector: startInternal
note right of Connector: to be continued 2/2

title Spring Boot booting process(2/2)
note left of Connector: continued from 1/2
Connector->AbstractProtocol: start
AbstractProtocol->AbstractEndpoint: start
AbstractEndpoint->NioEndpoint: startInternal
NioEndpoint->AbstractEndpoint: createExecutor
AbstractEndpoint->ThreadPoolExecutor: <init>
ThreadPoolExecutor->ThreadPoolExecutor: prestartAllCoreThreads
ThreadPoolExecutor->ThreadPoolExecutor: addWorker
ThreadPoolExecutor->ThreadPoolExecutor$Worker: <init>
ThreadPoolExecutor$Worker->TaskThreadFactory: newThread
TaskThreadFactory->TaskThread: <init>
TaskThread->TaskThread$WrappingRunnable: <init>
