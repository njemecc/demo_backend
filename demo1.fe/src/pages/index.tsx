import React from "react";
import Link from "next/link";

const Users = () => {
  return <>
  <h1>Home Page</h1>
  <Link href={"/users"}>Go to users page</Link>
  </>;
};

export default Users;
