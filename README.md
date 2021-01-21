### General Payment Demo

支持**微信Native**支付与**支付宝PC**支付，可以与其它项目集成。

>**开发框架及工具**：
SpringBoot (2.1.7)、MySql、Mybatis、Lombok <br>
开源项目 (best pay sdk)：https://github.com/Pay-Group/best-pay-sdk <br>
开源项目 (qrcode生成器)：https://github.com/jeromeetienne/jquery-qrcode

-----------------------
>**微信Native支付流程介绍**

应用后台生成订单并调用统一下单API，微信后台系统返回链接参数code_url，应用后台系统将code_url值生成二维码图片，用户使用微信客户端扫码后发起支付。支付完成后，微信后台异步发送支付结果，应用接收通知结果并返回接收通知。最后，应用调用查询订单API，获取支付状态并更新订单信息。

----------------------
>**支付宝PC支付流程介绍**

应用后台生成订单并调用支付接口 alipay.trade.page.pay(统一收单下单并支付页面接口)发起支付，为了保证交易双方（应用和支付宝）的身份和数据安全，商户在调用接口前，需要配置双方密钥，对交易数据进行双方校验。用户在支付宝收银台支付完成后，同步返回参数，支付结果则以异步通知为准。应用可以调用 alipay.trade.query（统一收单线下交易查询）接口自行查询交易以及支付信息。

----------------------

>**支付系统简介**

系统发起订单需要提供系统订单号和金额并需要指定支付平台/支付方式. 异步通知则利用支付系统返回信息进行签名校验、金额校验，并修改订单状态，通知支付平台返回消息已接收。应用也可通过订单号自主查询支付信息。








