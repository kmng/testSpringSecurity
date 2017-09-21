<g:each in="${todos}">
     <dl>
    <dt>Description: ${it.description}</dt>
    <dd>Date: ${it.dateCreated}</dd>
</dl>
</g:each>
