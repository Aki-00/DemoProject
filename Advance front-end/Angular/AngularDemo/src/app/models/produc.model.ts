export interface Product {
    id?: number;
    name: string;
    slug?: string;
    sell_price: number;
    image?: string;
    createdAt?: string| Date;
}