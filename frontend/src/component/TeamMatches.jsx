import { useState } from "react";
import PlayerService from "../Service/PlayerService";

function TeamMatches() {
    const [teamMatches, setTeamMatches] = useState([]);

    const loadTeamMatches = () => {
        PlayerService.getTeamMatches()
            .then((response) => {
                setTeamMatches(response.data);
            })
            .catch((error) => console.log(error));
    };

    return (
        <div className="container">
            <h2 className="fw-bold">Team Matches List</h2>

            <div className="mb-3">
                <button className="btn btn-primary" onClick={loadTeamMatches}>
                    Get Team Names & Total Matches
                </button>
            </div>

            {teamMatches.length > 0 && (
                <table className="table table-bordered table-striped table-hover">
                    <thead className="table-dark">
                        <tr>
                            <th>Team Name</th>
                            <th>Total Matches</th>
                        </tr>
                    </thead>
                    <tbody>
                        {teamMatches.map((team, index) => (
                            <tr key={index}>
                                <td>{team.teamName}</td>
                                <td>{team.totalMatches}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            )}
        </div>
    );
}

export default TeamMatches;
