import { faker } from '@faker-js/faker';

export interface User {
    firstName: string;
    lastName: string;
    email: string;
    mobile: string;
    password: string;
    confirmationPassword: string;
}

export function createUser(overrides: Partial<User> = {}): User {
    const password = "Test@" + faker.number.int({ min: 1000, max: 9999 });

    return {
        firstName: faker.person.firstName(),
        lastName: faker.person.lastName(),
        email: faker.internet.email(),
        mobile: faker.string.numeric(10),
        password: password,
        confirmationPassword: password,
        ...overrides
    };
}