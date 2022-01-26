# Automacao Android app ColorNote

> Automação de testes android realizada no app Color Note utilizando o Eclipse IDE(v.4.11), Selenium Webdriver, Cucumber BDD, Appium, uiAutomatorviewer, em linguagem Java e Gherkin.

### Validações

Os testes foram automatizados com as seguintes validações:

* Deve ser possível alterar a cor da nota ou lista.
* Deve ser possível marcar como concluído (checked) um ou vários itens de uma lista.
* Deve ser possível colocar um lembrete de 15 ou 30 minutos na nota ou lista.
* Deve ser possível excluir a nota ou lista.
* Ao ser excluída, a nota ou lista deve ser enviada para lixeira, sendo necessário excluir da lixeira para exclusão definitiva

## Info JSON para o Appium:
```
{
  "platformName": "Android",
  "deviceName": "SeuEmulador",
  "automationName": "uiautomator2",
  "appPackage": "com.socialnmobile.dictapps.notepad.color.note",
  "appActivity": "com.socialnmobile.colornote.activity.Main"
}
```
