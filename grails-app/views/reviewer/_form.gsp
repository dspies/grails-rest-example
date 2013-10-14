<%@ page import="demo.Reviewer" %>



<div class="fieldcontain ${hasErrors(bean: reviewerInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="reviewer.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${reviewerInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: reviewerInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="reviewer.description.label" default="Description" />
		
	</label>
	<g:textArea name="description" cols="40" rows="5" maxlength="255" value="${reviewerInstance?.description}"/>
</div>

