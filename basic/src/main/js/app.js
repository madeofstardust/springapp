'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {all_stories: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/all_storieses'}).done(response => {
			this.setState({all_stories: response.entity._embedded.all_stories});
		});
	}

	render() {
		return (
			<All_StoriesList all_stories={this.state.all_stories}/>
		)
	}
}

class All_StoriesList extends React.Component{
	render() {
		const all_stories = this.props.all_stories.map(all_story =>
			<All_Story key={all_story._links.self.href} all_story={all_story}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Title:</th>
						<th>ID:</th>
					</tr>
					{all_stories}
				</tbody>
			</table>
		)
	}
}

class All_stories extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.all_story.title_of_a_story}</td>
				<td>{this.props.all_story.ID}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)

//'use strict';
//
//// tag::vars[]
//const React = require('react');
//const ReactDOM = require('react-dom');
//const client = require('./client');
//// end::vars[]
//
//// tag::app[]
//class App extends React.Component {
//
//	constructor(props) {
//		super(props);
//		this.state = {employees: []};
//	}
//
//	componentDidMount() {
//		client({method: 'GET', path: '/api/employees'}).done(response => {
//			this.setState({employees: response.entity._embedded.employees});
//		});
//	}
//
//	render() {
//		return (
//			<EmployeeList employees={this.state.employees}/>
//		)
//	}
//}
//
//class EmployeeList extends React.Component{
//	render() {
//		const employees = this.props.employees.map(employee =>
//			<Employee key={employee._links.self.href} employee={employee}/>
//		);
//		return (
//			<table>
//				<tbody>
//					<tr>
//						<th>First Name</th>
//						<th>Last Name</th>
//						<th>Description</th>
//					</tr>
//					{employees}
//				</tbody>
//			</table>
//		)
//	}
//}
//
//class Employee extends React.Component{
//	render() {
//		return (
//			<tr>
//				<td>{this.props.employee.firstName}</td>
//				<td>{this.props.employee.lastName}</td>
//				<td>{this.props.employee.description}</td>
//			</tr>
//		)
//	}
//}
//
//ReactDOM.render(
//	<App />,
//	document.getElementById('react')
//)