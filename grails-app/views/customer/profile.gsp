%{--<%@ page import="rewards.Customer" %>--}%
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'customer.label', default: 'Customer')}" />
		<title>Customer Profile</title>
	</head>
	<body>
		<div id="edit-customer" class="content scaffold-edit" role="main">
			<h1>Customer Profile</h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${customer}">
			<ul class="errors" role="alert">
				<g:eachError bean="${customer}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[resource:customer, action:'updateProfile']" method="PUT" >
				<g:hiddenField name="version" value="${customer?.version}" />
				<fieldset class="buttons">
					<g:actionSubmit class="save" action="updateProfile" value="${message(code: 'default.button.update.label', default: 'Update')}" />
				</fieldset>
				<fieldset class="form">
					<div class="fieldcontain ${hasErrors(bean: customer, field: 'firstName', 'error')} ">
						<label for="firstName">
							<g:message code="customer.firstName.label" default="First Name" />
							
						</label>
						<g:textField name="firstName" value="${customer?.firstName}"/>
					</div>
					
					<div class="fieldcontain ${hasErrors(bean: customer, field: 'lastName', 'error')} ">
						<label for="lastName">
							<g:message code="customer.lastName.label" default="Last Name" />
							
						</label>
						<g:textField name="lastName" value="${customer?.lastName}"/>
					</div>
					
					<div class="fieldcontain ${hasErrors(bean: customer, field: 'phone', 'error')} required">
						<span id="phone-label" class="property-label"><g:message code="customer.phone.label" default="Phone" /></span>
						<span class="property-value" aria-labelledby="phone-label"><g:phone334 phone="${customer.phone}"/></span>
					</div>
					
					<div class="fieldcontain ${hasErrors(bean: customer, field: 'email', 'error')} ">
						<label for="email">
							<g:message code="customer.email.label" default="Email" />
							
						</label>
						<g:textField name="email" value="${customer?.email}"/>
					</div>
					
					<div class="fieldcontain ${hasErrors(bean: customer, field: 'totalPoints', 'error')} required">
						<span id="totalPoints-label" class="property-label"><g:message code="customer.totalPoints.label" default="Total Points" /></span>
						<span class="property-value" aria-labelledby="totalPoints-label"><g:fieldValue bean="${customer}" field="totalPoints"/></span>
						
					</div>
				</fieldset>
				
			</g:form>
		</div>
		
		<div id="list-award" class="content scaffold-list" role="main">
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="type" title="${message(code: 'award.type.label', default: 'Type')}" />
					
						<g:sortableColumn property="awardDate" title="${message(code: 'award.checkinDate.label', default: 'Award Date')}" />
					
						<th><g:message code="award.customer.label" default="Phone" /></th>
					
						<g:sortableColumn property="points" title="${message(code: 'award.points.label', default: 'Points')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${customer.awards}" status="i" var="checkinInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td>${fieldValue(bean: checkinInstance, field: "type")}</td>
					
						<td>${fieldValue(bean: checkinInstance, field: "awardDate")}</td>
					
						<td><g:phone334 phone="${customer.phone}"/></td>
					
						<td>${fieldValue(bean: checkinInstance, field: "points")}</td>
					</tr>
				</g:each>
				</tbody>
			</table>
			
		</div>
	</body>
</html>