import { User } from "./user";
import { Message } from "./message";

export interface Room {
    id: number;
    name: string;
    users: User[];
    messages: Message[];
}
