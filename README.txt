SLCA synthetic IntelliJ/Maven test project

Java: 17
Purpose: Safe synthetic files for testing Secure Logging Code Assistant.

Recommended first file:
src/main/java/com/example/test/service/TransferService.java

Other cases:
- CustomerService.java: sensitive-looking parameter names (civilId, token)
- ExceptionService.java: try/catch + downstream client call

Open in IntelliJ:
File > Open > select the slca-test-project folder.
