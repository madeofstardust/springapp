'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {all_stories: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/all_stories'}).done(response => {
			this.setState({all_stories: response.entity._embedded.all_stories});
		});
	}

	render() {
		return (
			<All_StoriesList all_stories={this.state.all_stories}/>
		)
	}
}
// end::app[]

// tag::employee-list[]
class All_StoriesList extends React.Component{
	render() {
		const all_stories = this.props.all_stories.map(all_stories1 =>
			<All_Stories key={all_stories1._links.self.href} all_stories1={all_stories1}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Title:</th>
						<th>ID:</th>
						//<th>Description</th>
					</tr>
					{all_stories}
				</tbody>
			</table>
		)
	}
}
// end::employee-list[]

// tag::employee[]
class All_Stories extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.all_stories1.Title_of_a_story}</td>
				<td>{this.props.all_stories1.ID}</td>
				//<td>{this.props.employee.description}</td>
			</tr>
		)
	}
}
// end::employee[]

// tag::render[]
ReactDOM.render(
	<App />,
	document.getElementById('react')
)
// end::render[]

